;; The neural net components 
(ns nn.comp
  (:refer-clojure)
  (:refer msl)
  (:refer msl.seq-numerical)
  (:refer msl.symbol)
  (:refer graph))
 
;; inf
(defn inf [id typ dep-ids]
  {:nn-id id
   :nn-typ typ
   :nn-dep-ids dep-ids})

(defn state [id dep-ids code-f]
  (assoc (inf id :state dep-ids)
    :nn-code-f code-f))
(defn const [id param]
  (assoc (inf id :const nil)
    :nn-param param))
(defn prev-state [id prev-id start-state] 
  (assoc (inf id :prev-state nil)
    :nn-prev-id prev-id
    :nn-start-state start-state))
(defn env-export [id dep-id export-key]
  (assoc (inf id :env-export [dep-id])
    :nn-export-key export-key))
(defn env-import [id import-key]
  (assoc (inf id :env-import nil)
    :nn-import-key import-key))


