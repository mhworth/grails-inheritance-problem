package test;

public abstract class AbstractFoo<T> implements Foo<T>{

	
	abstract protected void doClose() throws Exception;

	abstract protected void doOpen() throws Exception;

	abstract protected T doRead() throws Exception;
	
	public final T read() throws Exception {
		System.out.println("Reading by calling doRead");
		return doRead();
	}
	
}
