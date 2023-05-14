load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
load("@io_bazel_rules_scala//scala:scala_toolchain.bzl", "scala_toolchain")


scala_toolchain(
    name = "diagnostics_reporter_toolchain_impl",
    enable_diagnostics_report = True,
    visibility = ["//visibility:public"],
)

toolchain(
    name = "diagnostics_reporter_toolchain",
    toolchain = "diagnostics_reporter_toolchain_impl",
    toolchain_type = "@io_bazel_rules_scala//scala:toolchain_type",
    visibility = ["//visibility:public"],
)

scala_binary(
    name = "backend",
    main_class = "com.github.jmlb23.Main",
    srcs = glob([
        "**/*.scala"
    ]),
    deps = [
       "@maven//:org_typelevel_cats_effect_2_12",
       "@maven//:org_typelevel_cats_core_2_12"
    ],
)
