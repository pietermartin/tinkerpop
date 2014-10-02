package com.tinkerpop.gremlin.process.graph.step.map

import com.tinkerpop.gremlin.process.Traversal
import com.tinkerpop.gremlin.process.graph.step.ComputerTestHelper
import com.tinkerpop.gremlin.structure.Vertex

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public abstract class GroovyUntilTest {

    public static class StandardTestImpl extends UntilTest {
        public Traversal<Vertex, String> get_g_v1_untilXa_loops_gt_1X_out_asXaX_valueXnameX(final Object v1Id) {
            g.v(v1Id).until('a') { it.loops > 1 }.out.as('a').name
        }

        public Traversal<Vertex, String> get_g_v1_untilXa_1X_out_asXaX_valueXnameX(final Object v1Id) {
            g.v(v1Id).until('a', 1).out.as('a').name
        }

        public Traversal<Vertex, Long> get_g_V_untilXa_loops_gt_1X_out_asXaX_count() {
            g.V().until('a') { it.loops > 1 }.out.as('a').count
        }

        public Traversal<Vertex, Long> get_g_V_untilXa_1X_out_asXaX_count() {
            g.V.until('a', 1).out.as('a').count()
        }

        public Traversal<Vertex, String> get_g_V_untilXa_1_trueX_out_asXaX_valueXnameX() {
            g.V.until('a', 1) { true }.out.as('a').name
        }
    }

    public static class ComputerTestImpl extends UntilTest {
        public Traversal<Vertex, String> get_g_v1_untilXa_loops_gt_1X_out_asXaX_valueXnameX(final Object v1Id) {
            ComputerTestHelper.compute("g.v(${v1Id}).until('a') { it.loops > 1 }.out.as('a').name", g)
        }

        public Traversal<Vertex, String> get_g_v1_untilXa_1X_out_asXaX_valueXnameX(final Object v1Id) {
            ComputerTestHelper.compute("g.v(${v1Id}).until('a', 1).out.as('a').name", g)
        }

        public Traversal<Vertex, Long> get_g_V_untilXa_loops_gt_1X_out_asXaX_count() {
            ComputerTestHelper.compute("g.V().until('a') { it.loops > 1 }.out.as('a').count", g)
        }

        public Traversal<Vertex, Long> get_g_V_untilXa_1X_out_asXaX_count() {
            ComputerTestHelper.compute("g.V.until('a', 1).out.as('a').count()", g)
        }

        public Traversal<Vertex, String> get_g_V_untilXa_1_trueX_out_asXaX_valueXnameX() {
            ComputerTestHelper.compute("g.V.until('a', 1) { true }.out.as('a').name", g)
        }
    }
}
