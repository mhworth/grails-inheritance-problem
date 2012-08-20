package test;

import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.batch.item.support.AbstractItemCountingItemStreamItemReader;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;

public abstract class AbstractFoo<T> extends
		AbstractItemCountingItemStreamItemReader<T> implements
		ResourceAwareItemReaderItemStream<T>, InitializingBean {

	@Override
	protected void doClose() throws Exception {
		System.out.println("doClose");
	}

	@Override
	protected void doOpen() throws Exception {
		System.out.println("doOpen");
	}

	@Override
	protected T doRead() throws Exception {
		return null;
	}
	protected abstract int getNumberOfSheets();
	protected abstract void openExcelFile(Resource resource) throws Exception;
}