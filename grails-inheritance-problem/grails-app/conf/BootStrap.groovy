import test.BarImpl

class BootStrap {

    def init = { servletContext ->
		BarImpl b = new BarImpl()
		b.read()
		
    }
    def destroy = {
    }
}
