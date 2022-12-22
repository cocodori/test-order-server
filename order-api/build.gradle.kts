dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation(project(":order-core"))
}


// root gradle 설정과 반대로
// api 모듈을 통해 프로젝트를 부트스트랩 시킬 것이므로,
// bootJar를 생성하고 일반 jar를 생성하지 않도록 했다.
tasks.getByName("bootJar") {
	enabled = true
}

tasks.getByName("jar") {
	enabled = false
}