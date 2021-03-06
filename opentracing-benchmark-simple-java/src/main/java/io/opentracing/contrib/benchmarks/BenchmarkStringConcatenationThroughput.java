package io.opentracing.contrib.benchmarks;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

public class BenchmarkStringConcatenationThroughput extends BenchmarkStringConcatenation {

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public String testNoInstrumentation(StateVariables state) {
        return doNoInstrumentation(state);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void testNoopTracer(StateVariables state) {
        doNoopTracer(state);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void testMockTracer(StateVariables state) {
        doMockTracer(state);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void testJaegerTracer(StateVariables state) {
        doJaegerTracer(state);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void testHaystackTracer(StateVariables state) {
        doHaystackTracer(state);
    }
}
