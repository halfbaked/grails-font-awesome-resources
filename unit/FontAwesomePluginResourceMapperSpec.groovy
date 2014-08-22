import org.grails.plugin.resource.mapper.MapperPhase
import spock.lang.Specification

class FontAwesomePluginResourceMapperSpec extends Specification {
    def "test that soft reference to resources plugin works"() {
        expect: "That the phase is correct, when referenced soft in the class"
        FontAwesomePluginResourceMapper.phase == MapperPhase.ALTERNATEREPRESENTATION
    }
}
