name := "sbt-test-console-repro"

libraryDependencies ++= Seq(
  "ch.qos.logback"                % "logback-classic"           % "1.0.13",
  "com.codahale.metrics"          % "metrics-annotation"        % "3.0.2",
  "com.codahale.metrics"          % "metrics-core"              % "3.0.2",
  "com.codahale.metrics"          % "metrics-healthchecks"      % "3.0.2",
  "com.codahale.metrics"          % "metrics-json"              % "3.0.2",
  "com.google.guava"              % "guava"                     % "17.0",
  "com.google.inject"             % "guice"                     % "3.0",
  "com.google.inject.extensions"  % "guice-assistedinject"      % "3.0",
  "com.googlecode.libphonenumber" % "libphonenumber"            % "6.3",
  "com.maxmind.geoip2"            % "geoip2"                    % "0.7.1",
  "com.stripe"                    % "stripe-java"               % "1.10.0",
  "commons-codec"                 % "commons-codec"             % "1.8",
  "commons-validator"             % "commons-validator"         % "1.4.0",
  "joda-time"                     % "joda-time"                 % "2.2",
  "org.apache.commons"            % "commons-lang3"             % "3.1",
  "org.apache.commons"            % "commons-math3"             % "3.2",
  "org.apache.commons"            % "commons-pool2"             % "2.2",
  "org.apache.httpcomponents"     % "httpclient"                % "4.2.5",
  "org.apache.jclouds.api"        % "swift"                     % "1.8.0",
  "org.apache.jclouds.driver"     % "jclouds-slf4j"             % "1.8.0",
  "org.mongodb"                   % "mongo-java-driver"         % "2.12.3",
  "org.mongojack"                 % "mongojack"                 % "2.0.0",
  "com.fasterxml.jackson.core"    % "jackson-annotations"       % "2.2.3",
  "com.fasterxml.jackson.core"    % "jackson-core"              % "2.2.3",
  "org.projectlombok"             % "lombok"                    % "1.14.2",
  ("com.google.guiceberry"        % "guiceberry"                % "3.3.1"       % "test")
      .exclude("junit", "junit"),
  "junit"                         % "junit"                     % "4.11"        % "test",
  "com.novocode"                  % "junit-interface"           % "0.11"       % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v")
