package rsoi.lab2.ticket.responses;

import rsoi.lab2.ticket.model.Status;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class PurchaseTicketResponse implements Serializable {

    private String flightNumber;
    private UUID ticketUid;
    private String username;
    private Integer price;
    private Status status;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public UUID getTicketUid() {
        return ticketUid;
    }

    public void setTicketUid(UUID ticketUid) {
        this.ticketUid = ticketUid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseTicketResponse that = (PurchaseTicketResponse) o;
        return Objects.equals(flightNumber, that.flightNumber) && Objects.equals(ticketUid, that.ticketUid) && Objects.equals(price, that.price) && status == that.status && Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, ticketUid, price, status, username);
    }

    @Override
    public String toString() {
        return "PurchaseTicketResponse{" +
                "flightNumber='" + flightNumber + '\'' +
                ", ticketUid=" + ticketUid +
                ", price=" + price +
                ", status=" + status +
                ", username='" + username + '\'' +
                '}';
    }
}

