package gbintool

import org.junit.Test

class Test {
    @Test
    String shouldReturnHello() {
        Main m = new Main()
        assert 'Hello' == m.returnHello()
    }
}
