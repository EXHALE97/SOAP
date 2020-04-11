import org.apache.ws.axis2.HandbookServiceStub.JavaEETechnology;

interface ProtocolPerformer {

    void connect(String address);
    JavaEETechnology[] getAllTechnologies();
    void insert(JavaEETechnology technology);
    void delete(JavaEETechnology technology);
    void update(JavaEETechnology technology);
}
