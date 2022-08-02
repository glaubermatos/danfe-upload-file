  package com.glauber.nfeprocessservice.domain.listener;
  
  import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;

import com.glauber.nfeprocessservice.domain.event.NotaFiscalFalhouEvent;
import com.glauber.nfeprocessservice.domain.service.NotaFiscalStorageService;
  
  @Component 
  public class NotaFiscalProcessadaComFalhaEventListener {
  
	  private static final Logger logger = LoggerFactory.getLogger(NotaFiscalProcessadaComFalhaEventListener.class);
  
	  @Autowired private NotaFiscalStorageService notaFiscalStorageService;

	  @TransactionalEventListener
//	  @Transactional(propagation = Propagation.REQUIRES_NEW)
	  public void whenProcessedWithFailure(NotaFiscalFalhouEvent event) {
		  logger.info(String.format("Nota Fiscal %s processada com erro", event.getNotaFiscal().getNomeArquivo()));
		
		  File xmlFile = notaFiscalStorageService.findFileBy(event.getNotaFiscal().getNomeArquivo());
				
		  notaFiscalStorageService.moveToErrorDirectory(xmlFile);
	  }
  }
 