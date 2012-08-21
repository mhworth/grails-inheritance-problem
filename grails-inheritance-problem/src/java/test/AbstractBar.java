package test;

public abstract class AbstractBar<T> extends AbstractFoo<T> implements FooSubinterface<T> {

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
	
	public abstract T someMethod();
	
	protected abstract int getNumberOfSheets();
	
}