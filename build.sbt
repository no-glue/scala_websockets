unmanagedJars in Compile += file("/home/real/java_apps/websocket/target/websocket-1.0-SNAPSHOT.jar")

unmanagedClasspath in (Compile, runMain) += file("/home/real/java_apps/websocket/target/classes")

unmanagedClasspath in (Compile, runMain) += file("/home/real/java_apps/websocket/target/dependency/*")
