import test.Bar

class BootStrap {

    def init = { servletContext ->
		Bar b = new Bar()
		b.read()
		
    }
    def destroy = {
    }
}
