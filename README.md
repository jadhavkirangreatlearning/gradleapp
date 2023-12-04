# gradleapp
dependencies {

	implementation("org.springdoc:springdoc-openapi-ui:1.5.12")
	implementation "io.springfox:springfox-swagger2:2.7.0"
	implementation "io.springfox:springfox-swagger-ui:2.7.0"
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation 'org.springframework.boot:spring-boot-starter-validation'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	compileOnly 'org.projectlombok:lombok'
	developmentOnly 'org.springframework.boot:spring-boot-devtools'
	runtimeOnly 'com.mysql:mysql-connector-j'
	annotationProcessor 'org.projectlombok:lombok'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
}