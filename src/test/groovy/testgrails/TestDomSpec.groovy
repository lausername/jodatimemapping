package testgrails

import grails.testing.gorm.DomainUnitTest
import grails.util.Holders
import org.grails.datastore.mapping.model.MappingFactory
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
        PersistentEntity persistentEntity = TestDom.gormPersistentEntity
        persistentEntity.persistentProperties
        Boolean containsLocalDate = false
        persistentEntity.persistentProperties.each {
            if(it.name == 'localDate'){
                containsLocalDate = true
            }
        }
        containsLocalDate
    }
}
