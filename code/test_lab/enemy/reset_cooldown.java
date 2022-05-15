@Test
void resetCooldown() {
    assertTrue(enemyUnderTest.canShoot(0));
    enemyUnderTest.resetCooldown();
    assertFalse(enemyUnderTest.canShoot(0));
    assertTrue(enemyUnderTest.canShoot(0.5f));
}
