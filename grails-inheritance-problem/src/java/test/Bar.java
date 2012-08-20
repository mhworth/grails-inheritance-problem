package test;

import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;

public class Bar extends AbstractFoo<String> implements ResourceAwareItemReaderItemStream<String>, InitializingBean {

	@Override
	protected String doRead() throws Exception {
		
		return "Hello World";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
	}

	@Override
	public void setResource(Resource arg0) {
		
	}

	@Override
	protected int getNumberOfSheets() {
		return 0;
	}

	@Override
	protected void openExcelFile(Resource resource) throws Exception {
		
	}

}