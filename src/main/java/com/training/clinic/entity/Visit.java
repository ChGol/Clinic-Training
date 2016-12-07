package com.training.clinic.entity;

import java.time.LocalDateTime;

public class Visit {

    private long id;
    private LocalDateTime localDateTime;

    public Visit(long id, LocalDateTime localDateTime) {
        this.id = id;
        this.localDateTime = localDateTime;
    }

    public Visit() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "Visit{" + '\n' +
                "id=" + id +
                ", localDateTime=" + localDateTime +
                '}' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Visit)) return false;

        Visit visit = (Visit) o;

        if (getId() != visit.getId()) return false;
        return getLocalDateTime().equals(visit.getLocalDateTime());
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getLocalDateTime().hashCode();
        return result;
    }
}
