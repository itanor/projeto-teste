(defn invoking-java-code
  [param]
  (.toUpperCase param))

(defn make-greeter [greeting-prefix]
  (fn [username] (str greeting-prefix ", " username)))
