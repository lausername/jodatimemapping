import grails.util.Environment

grails.gorm.default.mapping = {

    'user-type' type: org.jadira.usertype.dateandtime.joda.PersistentDateTime, class: org.joda.time.DateTime
    'user-type' type: org.jadira.usertype.dateandtime.joda.PersistentLocalDate, class: org.joda.time.LocalDate
    'user-type' type: org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime, class: org.joda.time.LocalDateTime
}

dateFormat = 'dd/MM/yyyy'
timeFormat = 'HH:mm:ss'
jodatime.format.org.joda.time.LocalDate = dateFormat
jodatime.format.org.joda.time.DateTime = "${dateFormat} ${timeFormat}"
jodatime.format.org.joda.time.LocalDateTime = "${dateFormat} ${timeFormat}"

grails.gorm.default.constraints = {
    '*'(nullable: true)
}