...
class LifeProcesserTest {
    private World world;
    private LifeProcesser lifeProcesser;
    private GameData gameData;
    @BeforeEach
    void setUp() {
        lifeProcesser = new LifeProcesser();
        gameData = new GameData();
        world = new World();
    }
...
