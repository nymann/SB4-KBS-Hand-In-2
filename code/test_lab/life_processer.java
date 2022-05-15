@org.junit.jupiter.api.Test
void process() {
    Entity entity = new Entity();
    world.addEntity(entity);
    lifeProcesser.process(gameData, world);
    Entity found = world.getEntity(entity.getID());
    LifePart lifePart = new LifePart(0, 0);
    found.add(lifePart);
    assertNotNull(found);
    lifeProcesser.process(gameData, world);
    Entity notFound = world.getEntity(entity.getID());
    assertNull(notFound);
}
