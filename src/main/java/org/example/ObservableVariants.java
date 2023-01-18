package org.example;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;

import java.util.List;

public class ObservableVariants {

    public static void main(String[] args) {
        //Single Observable emits only one element
        Observable<String> source = Observable.fromIterable(List.of("Jack", "Gill"));
        Observable<String> emptySource = Observable.empty();

        source.first("default text").subscribe(System.out::println);

        Single<String> singleSource = Single.just("Lester");
        singleSource
                .subscribe(System.out::println);

        //Observable Maybe - May or May Not emit a valuable

        emptySource.
                firstElement().
                subscribe(System.out::println);

    }

}
