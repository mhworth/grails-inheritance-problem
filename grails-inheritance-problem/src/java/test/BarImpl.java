package test;


public class BarImpl extends AbstractBar<String>  {

	@Override
	protected String doRead() throws Exception {
		System.out.println("Hello world!");
		return "Hello World";
	}

	
	@Override
	protected int getNumberOfSheets() {
		return 0;
	}


	@Override
	public String someMethod() {
		return null;
	}

}