(ns projeto-teste.core
  (:gen-class))

(load "basic")
(load "list")
(load "functions")
(load "bindings")
(load "destructuring")
(load "flow-control")
(load "metadata")
; (load "java-random")
(load "unifying-data-with-sequences")

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ; (imprime-parametro "itanor")
  ; (println (uso-de-if false))
  ; (println (uso-de-do true))
  ; (println(uso-de-when true))
  ; (println (uso-de-nil 1))
  ; (println (uso-de-nil nil))
  ; (uso-de-filter)
  ; (println (uso-de-some))
  ; (println (invoking-java-code "itanor"))

  ; (def hello-greeting (make-greeter "Hello"))
  ; (def alo-greeting (make-greeter "Alo"))
  ; (println (hello-greeting "world"))
  ; (println (alo-greeting "world"))

  ; (println (square-corners 12 10 6))
  ; (greet-author-1 {:last-name "Strapazzon" :first-name "Itanor"})
  ; (greet-author-2 {:last-name "Strapazzon" :first-name "Itanor"})
  ; (println (first-two-dimensions))
  ; (println (first-two [12 1 6]))
  ; (println (last-only [45 77 88]))
  ; (println (collection-and-elements))
  ; (println (ellipsize "The quick brown fox jumps over the lazy dog"))
  ; (println (is-small 500))
  ; (println (is-small-using-do 200))
  ; (println (test-loop-recur))

  ; (println (= stu serializable-stu))
  ; (println (identical? stu serializable-stu))

  ; (println (meta stu))
  ; (println (meta serializable-stu))
  ; pode ser usado o caracter ^ no lugar da função meta, mas não funcionou aqui
  ; (println (^stu))

  ; (println stu-with-address)
  ; (println (meta stu-with-address))
  ; (println (meta #'str))

  ; (println (primeiro-da-list))
  ; (println (resto-da-list))
  ; (println (constroi-nova-list))

  ; (println (primeiro-do-vector))
  ; (println (resto-do-vector))
  ; (println (constroi-novo-vector))

  ; (println (primeiro-do-map))
  ; (println (resto-do-map))
  ; (println (constroi-novo-map))

  ; (println (primeiro-do-set))
  ; (println (resto-do-set))
  ; (println (constroi-novo-set))
  ; (println (novo-set-ordenado))
  ; (println (conjuncao-para-lista))
  ; (println (conjuncao-para-vetor))

  ; (println (into-para-lista))
  (println (into-para-vetor))
  
)
