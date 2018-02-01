package testgrails

import grails.testing.gorm.DomainUnitTest
import grails.util.Holders
import org.grails.datastore.mapping.model.PersistentEntity
import spock.lang.Specification

class TestDomSpec extends Specification implements DomainUnitTest<TestDom> {

    def setup() {
    }

    def cleanup() {
    }

    void "test joda time property on persistentEntity"() {
        expect: "Joda property found on persistent entity"
        domain.properties != null
        PersistentEntity persistentEntity = Holders.grailsApplication.mappingContext.getPersistentEntity(domain.class.getName())
        persistentEntity.getPropertyByName('localDate') != null
    }
}
