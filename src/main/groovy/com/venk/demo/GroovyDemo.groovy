class HelloGroovy {
    private id
}

static void main(String[] args) {
    println 'hello groovy'
    def resultId = test()
    println "result is $resultId"
}

static def test() {
    def id = 999
    HelloGroovy helloGroovy = new HelloGroovy()
    helloGroovy.id = id
    id++
    println "new id is $id"
    println "groovy id is $helloGroovy.id"
    id = 666
}

static def spockTest() {
    // Spock单元测试框架语法
    given:
    def id = 999
    when:
    id = 999
    then:
    HelloGroovy helloGroovy = new HelloGroovy()
    helloGroovy.id = id
    id++
    println "groovy id is ${helloGroovy.id}"
    println "new id is ${id}"
    expect:
    id == 1000
    cleanup:
    id = null
    println "final clean id is ${id}"
}