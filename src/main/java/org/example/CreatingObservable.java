package org.example;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

import java.util.List;

public class CreatingObservable {

    public static void main(String[] args) {
        Observable<Integer> observable = Observable.create(
                e -> {
                    e.onNext(10);
                    e.onNext(11);
                    e.onNext(12);
                    e.onComplete();
                }
                );

        observable.subscribe(System.out::println);

        //just

        Observable<Integer> just = Observable.just(1,2,3);
        just.subscribe(System.out::println);

        //from

        List<String> myList = List.of("Lester","Jess","Coco");

        Observable<String> fromIterable = Observable.fromIterable(myList);

        fromIterable.subscribe(System.out::println);

        //range

        Observable<Integer> fromRange = Observable.range(3,10);

        fromRange.subscribe(System.out::println);

        

    }


}
