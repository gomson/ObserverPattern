package com.guigarage.observer;

import org.junit.Assert;
import org.junit.Test;

import javax.observer.tck.CheckBooleanObservable;

/**
 * Created by hendrikebbers on 11.11.16.
 */
public class BasicObservableTest {

    @Test
    public void testBooleanObservable() {
        try {
            BasicObservable<Boolean> observable = new BasicObservable<>();
            CheckBooleanObservable.checkBooleanObservableBasicMethods(observable);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Error");
        }

        try {
            BasicObservable<Boolean> observable = new BasicObservable<>();
            CheckBooleanObservable.checkBooleanObservableChangeFromTrueToFalse(observable, b -> observable.updateValue(b));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Error");
        }

        try {
            BasicObservable<Boolean> observable = new BasicObservable<>();
            CheckBooleanObservable.checkBooleanObservableChangeFromFalseToTrue(observable, b -> observable.updateValue(b));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Error");
        }

        try {
            BasicObservable<Boolean> observable = new BasicObservable<>();
            CheckBooleanObservable.checkBooleanObservableChangeFromFalseToNull(observable, b -> observable.updateValue(b));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Error");
        }

        try {
            BasicObservable<Boolean> observable = new BasicObservable<>();
            CheckBooleanObservable.checkBooleanObservableChangeFromTrueToNull(observable, b -> observable.updateValue(b));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Error");
        }

        try {
            BasicObservable<Boolean> observable = new BasicObservable<>();
            CheckBooleanObservable.checkBooleanObservableFireNoChangeForSameValue(observable, b -> observable.updateValue(b));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Error");
        }

        try {
            BasicObservable<Boolean> observable = new BasicObservable<>();
            CheckBooleanObservable.checkBooleanObservableNoValueChangedAfterUnsubscribe(observable, b -> observable.updateValue(b));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Error");
        }
    }

}
