(ns nn.test
  (:refer-clojure)
  (:refer nn.comp)
  (:refer nn.gen))

(defn t1 []
  (let [c0 (const 0 1.4)
	
	w0 (const 10 0.5)
	w1 (const 11 -1.0)
	b0 (const 12 0.4)

	p0 (prev-state 100 30 0.0)
	p1 (prev-state 101 20 0.0)
	i0 (env-import 110 :import0)

	m0 (state 20 [10 100] (nn.state-funcs/weight))
	m1 (state 21 [11 110] (nn.state-funcs/weight))
	
	s0 (state 30 [20 21 12] (nn.state-funcs/signum--1+1))
	s1 (state 31 [20 100 101 12] (nn.state-funcs/signum-0+1))

	e0 (env-export 200 30 :export0)
	e1 (env-export 201 31 :export1)
      
	infs [c0 w0 w1 b0 p0 p1 i0 m0 m1 s0 s1 e0 e1]
	ns (nn.gen/infs->connected-nnsym-nodes infs)]
    
    ;; (nn.gen/nodes->assign-nnsym ns)

   (nn.gen/infs->zs0-upd-f infs)))

	
	

;; (defn t0 []
;;   (let [c0 (const 0 1)

;; 	w0 (const 10 0.5)
;; 	w1 (const 11 -1.0)
;; 	b0 (const 12 0.4)

;; 	m0 (state 20 [10 0] :*)
;; 	m1 (state 21 [11 0] :*)
	
;; 	s0 (state 30 [20 21 12] :signum-+1-1)
	
;; 	ns (infs->connected-nodes [c0 w0 w1 b0 m0 m1 s0])

;; 	i20 (id->node ns 20)
;; 	i30 (id->node ns 30)]

;;     (println (:nn-id @i20))
;;     (println (nnid->nnsym (:nn-id @i30)))

;;     ;; checking connections
;;     (assert (graph/n->n? (id->node ns 10) (id->node ns 20) e))
;;     (assert (graph/n->n? (id->node ns 20) (id->node ns 30) e))

;; ;;     ;; translate into symnodes
;; ;;     (let [sns (inf-graph->sym-clause-graph g)]
;; ;; ;;      (println (map #(:nn-sym-clause @%) sns))
;; ;;       (println (sym-clause-graph->let-sym-clause-pairs sns))
;; )) 