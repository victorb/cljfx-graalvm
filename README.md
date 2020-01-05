# cljfx-graalvm

Experiment to get javafx, cljfx and graalvm native image functionality to play
nicely together.

Goal is to have a desktop application launched by a binary compiled by GraalVM.

## Current Status: Doesn't work

- `lein run` works and process shuts down correctly when closing application
- `lein uberjar` works and builds something that runs with `java -jar`
- `lein native-image` does not work and outputs tons of errors

## Versions used

- Clojure `1.10.1-patch_38bafca9_clj_1472_3` built from `https://github.com/lread/clj-graal-docs/tree/master/CLJ-1472`
- cljfx 1.6.1
- Java JDK 11.0.1 (`java-11-jdk` from arch repositories)
- graalvm-ce-java11-19.3.0.2

## Misc

### Generate Trace

`./bin/java -agentlib:native-image-agent=config-output-dir=/home/user/projects/victorb/cljfx-graalvm/META-INF/native-image -jar /home/user/projects/victorb/cljfx-graalvm/target/uberjar/cljfx-graalvm-0.1.0-SNAPSHOT-standalone.jar`

## License

MIT 2020 - Victor Bjelkholm
