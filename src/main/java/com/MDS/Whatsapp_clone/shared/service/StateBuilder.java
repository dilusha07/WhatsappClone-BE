package com.MDS.Whatsapp_clone.shared.service;

public class StateBuilder<T, V> {
    private StatusNotification status;
    private T value;
    private V error;

    public StatusNotification getStatus() {
        return status;
    }

    public void setStatus(StatusNotification status) {
        this.status = status;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public V getError() {
        return error;
    }

    public void setError(V error) {
        this.error = error;
    }

    public State<T, V> forError(V error) {
        this.error = error;
        this.status = StatusNotification.ERROR;
        return new State<>(this.status, this.value, this.error);
    }

    public State<T, V> forSuccess() {
        this.status = StatusNotification.OK;
        return new State<>(this.status, this.value, this.error);
    }

    public State<T, V> forSuccess(T value) {
        this.value = value;
        this.status = StatusNotification.OK;
        return new State<>(this.status, this.value, this.error);
    }
    public State<T, V> forUnauthorized(V error) {
        this.error = error;
        this.status = StatusNotification.UNAUTHORIZED;
        return new State<>(this.status, this.value, this.error);
    }

}

