plugins {
    id("org.jetbrains.kotlin.js") version "1.3.72"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation(kotlin("stdlib-js"))


	//todo: bugfix in kx.serialization?
	implementation(npm("text-encoding"))
	implementation(npm("abort-controller"))

//	implementation("io.ktor:ktor-client-js:$ktorVersion") //include http&websockets
	//todo: bugfix in ktor-client?
	//see https://github.com/ktorio/ktor/issues/961
	implementation(npm("bufferutil")) //TODO: Uncomment this and stuff breaks. WHY?
	implementation(npm("utf-8-validate"))

}

kotlin.target.browser { }
