unmanagedJars in Compile += file("/home/real/java_apps/websocket/target/websocket-1.0-SNAPSHOT.jar")

unmanagedClasspath in Compile += file("/home/real/java_apps/websocket/target/classes")

unmanagedClasspath in Runtime += file("/home/real/java_apps/websocket/target/classes")

unmanagedClasspath in Compile += file("/home/real/java_apps/websocket/target/dependency/*")

unmanagedClasspath in Runtime += file("/home/real/java_apps/websocket/target/dependency/*")
