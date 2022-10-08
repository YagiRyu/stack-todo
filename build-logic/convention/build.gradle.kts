plugins {
  `kotlin-dsl`
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
  implementation(libs.androidGradlePlugin)
  implementation(libs.kotlinGradlePlugin)
}

gradlePlugin {
  plugins {
    register("androidApplicationCompose") {
      id = "stack.android.application.compose"
      implementationClass = "AndroidApplicationComposeConventionPlugin"
    }
    register("androidApplication") {
      id = "stack.android.application"
      implementationClass = "AndroidApplicationConventionPlugin"
    }
    register("androidLibrary") {
      id = "stack.android.library"
      implementationClass = "AndroidLibraryConventionPlugin"
    }
    register("androidLibraryCompose") {
      id = "stack.android.library.compose"
      implementationClass = "AndroidLibraryComposeConventionPlugin"
    }
    register("androidFeature") {
      id = "stack.android.feature"
      implementationClass = "AndroidLibraryFeatureConventionPlugin"
    }
  }
}
