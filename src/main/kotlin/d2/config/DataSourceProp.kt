package d2.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties("spring.datasource")
class DataSourceProp {
    lateinit var driverClassName: String
    lateinit var url: String
    lateinit var username: String
    lateinit var password: String
    lateinit var platform: String

    @Autowired
    lateinit var hikari: HikariPorp

    @Component
    @ConfigurationProperties("spring.datasource.hikari")
    class HikariPorp {
        lateinit var connectionTestQuery: String
        lateinit var poolName: String
    }
}
