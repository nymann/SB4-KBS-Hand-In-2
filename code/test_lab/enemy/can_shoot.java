@Test
void canShoot() {
    assertFalse(enemyUnderTest.canShoot(-100));
    assertFalse(enemyUnderTest.canShoot(99));
    assertTrue(enemyUnderTest.canShoot(1));
}
