load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "app",
    srcs = glob([
        "**/*.scala"
    ]),
    visibility = [ "//visibility:public" ],
    deps = [
        "//backend/domain:domain",
       "@maven//:org_typelevel_cats_effect_2_13",
       "@maven//:org_typelevel_cats_core_2_13",
       "@maven//:org_tpolecat_doobie_core_2_13",
       "@maven//:org_http4s_http4s_ember_server_2_13",
       "@maven//:org_http4s_http4s_dsl_2_13"
    ],
)
