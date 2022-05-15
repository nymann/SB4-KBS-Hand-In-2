@Test
void getEntityType() {
    assertNotSame(enemyUnderTest.getEntityType(), EntityType.ASTEROID);
    assertSame(enemyUnderTest.getEntityType(), EntityType.SHIP);
}
