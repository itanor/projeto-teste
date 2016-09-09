(def stu {:name "Stu" :email "stu@someserver.com"})
(def serializable-stu (with-meta stu {:serializable true}))
(def stu-with-address (assoc serializable-stu :state "NC"))
