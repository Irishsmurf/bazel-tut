java_binary(
    name = "echobin",
    srcs = [
      "src/EchoHello.java"
    ],
    main_class = "com.paddez.EchoHello",
    deps = [":echo"]
)

java_library(
    name = "echo",
    srcs = ["src/EchoClass.java"],
)

java_test(
  name = "tests",
  size = "small",
  srcs = ["test/TestEchoClass.java"],
  test_class = "com.paddez.TestEchoClass",
  deps = [
    ":echo",
    "//third_party:junit4"
  ]
)

genrule(
  name = "hello",
  outs = ["hello_world.txt"],
  cmd = "echo Hello World > $@",
)
