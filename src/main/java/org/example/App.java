package org.example;

import io.reactivex.rxjava3.core.Observable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Observable<String> stringObservable = Observable.create(
                e-> {
                    e.onNext("Hello");
                    e.onNext("RxJava");
                }
                );
        stringObservable.subscribe(e-> System.out.println("Observer 1 : "+e));
        stringObservable.subscribe(e-> System.out.println("Observer 2 : "+e));

    }
}
