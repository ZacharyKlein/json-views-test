import com.ociweb.Book

class BootStrap {

    def init = { servletContext ->

        new Book(title: 'book1').save(flush: true)
        new Book(title: 'book2').save(flush: true)
        new Book(title: 'book3').save(flush: true)

    }
    def destroy = {
    }
}
