package d2.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties("spring.datasource")
class DataSourceProp {
    lateinit var driverClassName: String
    lateinit var url: String
    lateinit var username: String
    lateinit var password: String
}

@Component
@ConfigurationProperties("spring.datasource.hikari")
class HikariPorp {
    lateinit var connectionTestQuery: String
    lateinit var dataSourceClassName: String
    lateinit var poolName: String
}
