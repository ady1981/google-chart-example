(ns google-chart-example.macros)

(defmacro load-edn
  "Reads a file and returns it as a string"
  [relative-path]
  (slurp relative-path))