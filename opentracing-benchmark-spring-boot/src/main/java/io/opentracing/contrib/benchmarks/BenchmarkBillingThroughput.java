package io.opentracing.contrib.benchmarks;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import io.opentracing.contrib.billing.model.Invoice;

public class BenchmarkBillingThroughput extends BenchmarkBilling {

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public Invoice benchmarkBillingNotInstrumented(StateVariablesNotInstrumented state) {
        return doBenchmarkBillingNotInstrumented(state);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public Invoice benchmarkBillingNoopTracer(StateVariablesNoopTracer state) {
        return doBenchmarkBillingNoopTracer(state);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public Invoice benchmarkBillingJaegerTracer(StateVariablesJaeger state) {
        return doBenchmarkBillingJaegerTracer(state);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public Invoice benchmarkBillingHaystackTracer(StateVariablesHaystack state) {
        return doBenchmarkBillingHaystackTracer(state);
    }
}


