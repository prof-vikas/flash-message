## Flash Message

> Step 1. Add the JitPack repository to your build file
```
	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```

> Step 2. Add the dependency
```
	dependencies {
	        implementation 'com.github.prof-vikas:flash-message:Tag'
	}
```
