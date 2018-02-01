package testgrails

import org.jadira.usertype.dateandtime.joda.PersistentDateTime
import org.joda.time.LocalDate

class TestDom {

    String test;

    LocalDate localDate

    static constraints = {
    }

    static mapping = {
        test nullable: true, size: 1..17
        localDate type: PersistentDateTime
    }
}
