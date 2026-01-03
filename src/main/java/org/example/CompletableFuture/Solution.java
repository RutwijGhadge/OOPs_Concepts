package org.example.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/*
Completable future is an asynchronous programming abstraction introduced in Java 8 that represents
a future result of a computation and allows chaining , composition and error handling

Why it exists

Future had major limitations:
❌ No callbacks
❌ Blocking get()
❌ No chaining
❌ Poor error handling
CompletableFuture solves all of this

Core Concepts (Very Important)
🔹 Asynchronous execution
Runs tasks without blocking the calling thread.

🔹 Non-blocking callbacks
You attach actions that run when the result is ready.

🔹 Pipeline / Chain model
Each stage depends on the previous one.
 */

public class Solution {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Basic Example : supplyAsync() - returns a value
        //                runAsync() - no return value
        CompletableFuture<String>future=
                CompletableFuture.supplyAsync(()-> {
                            return "Hello";
                });
        System.out.println(future.get());

        //Chaining
        //thenApply-> Transform : Runs after previous thread , Same thread/Async Pool
        CompletableFuture<String>future1=
                CompletableFuture.supplyAsync(()->"Hello")
                        .thenApply(result->result+ " world");
        System.out.println(future1.get() + " : from chaining");

        //thenAccept -> consume : No Return Value
        CompletableFuture.supplyAsync(()-> "Hello")
                .thenAccept(result-> System.out.println(result +" : from consume"));

        //thenRun -> just run : Ignores Result
        CompletableFuture.supplyAsync(()-> "hello")
                .thenRun(()-> System.out.println("Done"));

        //Use Async when you don't want to block the previous thread.

        //Combining Multiple Futures -> thenCompose(FlatMap) : Used when next async depends on previous result
        /*
        CompletableFuture<User> userFuture =
              getUserId()
                    .thenCompose(id -> getUserById(id));
         */

        //thenCombine() -> two independent futures -> combine results
        CompletableFuture<Integer>f1=CompletableFuture.supplyAsync(()-> 10);
        CompletableFuture<Integer>f2=CompletableFuture.supplyAsync(()->20);

        CompletableFuture<Integer>result=
                f1.thenCombine(f2,Integer::sum);
        System.out.println(result.get());

        //allOf : wait for all futures
        CompletableFuture<Void>all=
                CompletableFuture.allOf(f1,future1,f2);
        all.join();

        //anyOf : First Completable Future wins
        CompletableFuture<Object>any=
                CompletableFuture.anyOf(f1,f2);

        //Exceptionally : Exception Handling
        CompletableFuture<Object> exc=
                CompletableFuture.supplyAsync(()-> {
                    throw new RuntimeException("Error occurred");
                        }).exceptionally(ex -> "Fallback");
        System.out.println(exc.get());

        //handle (Success + Failure)
        exc.handle((results,ex)-> {
            if (ex != null) return "Recovered";
            return results;
        });

        /*
        | Method       | Input        | Output             |
        | ------------ | ------------ | ------------------ |
        | `thenApply`  | Takes result | Returns new result |
        | `thenAccept` | Takes result | No return          |
        | `thenRun`    | No input     | No return          |
        |------------  | ------------ | ------------------ |

        .thenApply(r -> r + "X")
        .thenAccept(System.out::println)
        .thenRun(() -> log.info("Done"));

         */


    }
}
